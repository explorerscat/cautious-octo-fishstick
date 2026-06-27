
ROOT=$(shell pwd)
SRC=${ROOT}/$$Goldsrc
BUILD=${ROOT}/build
SCRIPT=${ROOT}/Scripts
ASSET=${ROOT}/Assets

CLEANASSET=${ASSET}/Indoraptor.dna

export BUILD

THIS=Nyananamn
MC=com.igndirodog.Spam

build:
	mkdir -p ${BUILD}
	cd ${ASSET} && ${SCRIPT}/indoraptor.py
	cd '${SRC}' && ./build.sh
	jar -cfe ${ROOT}/${THIS}.jar ${MC} -C ${ROOT} Assets/ -C ${BUILD} com/

.PHONY: build clean run rebuild

clean:
	rm -rf ${BUILD}
	rm -f ${ROOT}/${THIS}.jar
	rm -f "`find '${SRC}' -name '*.class'`"
	rm -f ${CLEANASSET}

rebuild:
	@make clean
	@make build

run:
	@make -s rebuild >/dev/null
	@java -jar ${ROOT}/${THIS}.jar

