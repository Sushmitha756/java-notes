From openjdk
WORKDIR /demo
ADD . /demo/
RUN javac operators.java
CMD ["java","operators"]
