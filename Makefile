CLASSPATH = acm.jar
CFLAGS = -cp $(CLASSPATH)

JAVA_FILES = Game.java
CLASS_FILES = $(JAVA_FILES:.java=.class)


all: triangles
	java Game

triangles: Game.class

%.class: %.java
	javac $(CFLAGS) $<


clean:
	rm -f *.class
