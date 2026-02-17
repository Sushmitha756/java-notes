FROM king019/jdk:latest
WORKDIR /app
COPY . /app
RUN javac controlstatements.java
CMD ["java","controlstatements"]
