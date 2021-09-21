# compile
pkgdir=MyPackage
find $pkgdir -type f -name *.java -exec javac {} \;

# run
java MyPackage.Test

# clean
find $pkgdir -type f -name *.class -exec rm {} \;
