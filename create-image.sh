mvn -DskipTests=true clean package
docker build -t joshuaenos/spring-boot-k8s .
docker push joshuaenos/spring-boot-k8s