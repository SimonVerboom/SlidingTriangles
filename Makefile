CLASSPATH = acm.jar
CFLAGS = -cp $(CLASSPATH)

JAVA_FILES = main.java
CLASS_FILES = $(JAVA_FILES:.java=.class)


all: triangles

traingles: main.class

%.class: %.java
	javac $(CFLAGS) $<


clean:
	rm -f *.class
