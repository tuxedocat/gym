#!/bin/sh

srcdir=./src/main/scala/
testdir=./src/test/scala/

# BSD's sed by default because I'm on a mac
# inplace_sed="sed -i ''"
# --- alternative for gnu-sed
#     inplace_sed="sed -i''"

# Problem name (used also as pkgname)
probname="$1"

# Validation
if (( ! $(echo ${probname} | pcregrep -c '\.') )) ; then
    exit 1
fi

# Convert dots to slash
pkgpath="${probname/.//}"
clsname=$(echo ${probname} | sed -e 's/\.//g' | awk '{print toupper($0)}')
echo $clsname
mainpath=${srcdir}${pkgpath}/Main.scala
testpath=${testdir}${pkgpath}/${clsname}Spec.scala

echo $mainpath
echo $testpath

mkdir -p "${srcdir}${pkgpath}" && cp _templates/Main.scala "${mainpath}"
mkdir -p "${testdir}${pkgpath}" && cp _templates/Spec.scala "${testpath}"

sed -i.bak -e "s/{{pkgname}}/${probname}/g" ${mainpath} && rm "${mainpath}.bak"
sed -i.bak -e "s/{{pkgname}}/${probname}/g" ${testpath} && rm "${testpath}.bak"
sed -i.bak -e "s/{{clsname}}/${clsname}Spec/g" ${testpath} && rm "${testpath}.bak"

