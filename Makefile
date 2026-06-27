
ROOT=$(shell pwd)
SRC=${ROOT}/$$Goldsrc
BUILD=${ROOT}/build
SCRIPT=${ROOT}/Scripts
ASSET=${ROOT}/Assets

export BUILD

THIS=Nyananamn
MC=com.igndirodog.Spam

build: ${ASSET}/Indoraptor.dna
	mkdir -p ${BUILD}
	cd '${SRC}' && ./build.sh
	jar -cfe ${ROOT}/${THIS}.jar ${MC} -C ${ROOT} Assets/ -C ${BUILD} com/

.PHONY: build clean run rebuild

${ASSET}/Indoraptor.dna:
	cd ${ASSET} && ${SCRIPT}/indoraptor.py

clean:
	rm -rf ${BUILD}
	rm -f ${ROOT}/${THIS}.jar
	rm -f "`find '${SRC}' -name '*.class'`"

rebuild:
	@make clean
	@make build

run:
	@make -s rebuild >/dev/null
	@java -jar ${ROOT}/${THIS}.jar

