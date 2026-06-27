
ROOT=$(shell pwd)
SRC=${ROOT}/$$GoldSrc
BUILD=${ROOT}/build

export BUILD

THIS=Nyananamn

build:
	mkdir -p ${BUILD}
	cd '${SRC}' && ./build.sh
	cd ${BUILD} && jar -cfe ${ROOT}/${THIS}.jar com.igndirodog.Spam com/

.PHONY: build clean

clean:
	rm -rf ${BUILD}
	rm -f ${ROOT}/${THIS}.jar
	rm -f "`find '${SRC}' -name '*.class'`"


