#!/bin/bash

srcdir=./src/main/kotlin/
testdir=./src/test/kotlin/

# BSD's sed by default because I'm on a mac
# inplace_sed="sed -i ''"
# --- alternative for gnu-sed
#     inplace_sed="sed -i''"

probname="$1"
pkgname=$(echo ${probname} | awk '{print tolower($0)}')

# Validation
if (( ! $(echo ${probname} | pcregrep -c '\.') )) ; then
    echo "probname should be <contest>.<prob> e.g. abc001.c"
    exit 1
fi

# Convert dots to slash
pkgpath="${probname/.//}"
pkgpath=$(echo ${pkgpath} | awk '{print tolower($0)}')

clsname=$(echo ${probname} | sed -e 's/\.//g' | awk '{print toupper($0)}')
echo $clsname
mainpath=${srcdir}${pkgpath}/${clsname}.kt
testpath=${testdir}${pkgpath}/${clsname}Spec.kt

echo $mainpath
echo $testpath

mkdir -p "${srcdir}${pkgpath}" && cp _templates/Main.kt "${mainpath}"
mkdir -p "${testdir}${pkgpath}" && cp _templates/Spec.kt "${testpath}"

sed -i '' -e "s/{{pkgname}}/${pkgname}/g" ${mainpath}
sed -i '' -e "s/{{pkgname}}/${pkgname}/g" ${testpath}
sed -i '' -e "s/{{clsname}}/${clsname}Spec/g" ${testpath}

