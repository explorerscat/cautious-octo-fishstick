#!/usr/bin/env bash

if [ "$BUILD" = "" ]
then
	BUILD='../build'
fi

if [ ! -d "$BUILD" ]
then
	mkdir -p "$BUILD"
fi

eex()
{
	cmd="$@"
	echo "$cmd"
	$cmd
}

for f in `find . -name '*.java'`
do
	eex javac "$f"
done

eex zip tmp.zip "`find . -name '*.class'`"
mv tmp.zip "$BUILD"
cd "$BUILD"
eex unzip tmp.zip
eex rm tmp.zip

