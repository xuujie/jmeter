FROM openjdk:11-jdk

ARG JMETER_VERSION="5.1.1"
ARG JMETER_INFLUXDB_WRITER_VERSION="1.0"
ENV	JMETER_DOWNLOAD_URL https://archive.apache.org/dist/jmeter/binaries/apache-jmeter-${JMETER_VERSION}.tgz
ENV JMETER_HOME /opt/apache-jmeter-${JMETER_VERSION}
ENV	JMETER_BIN	${JMETER_HOME}/bin

RUN mkdir -p /tmp/binaries \
    && curl -L --silent ${JMETER_DOWNLOAD_URL} > /tmp/binaries/apache-jmeter-${JMETER_VERSION}.tgz \
    && mkdir -p /opt \
    && tar -xzf /tmp/binaries/apache-jmeter-${JMETER_VERSION}.tgz -C /opt \
    && rm -rf /tmp/binaries

COPY ./rmi_keystore.jks $JMETER_BIN
COPY ./slave.sh $JMETER_BIN

ENV PATH $PATH:$JMETER_BIN

WORKDIR	${JMETER_BIN}

CMD ["./slave.sh"]
