docker-compose down
docker build -t xuujie/jmeter-master:latest .
docker push xuujie/jmeter-master:latest
docker-compose up -d