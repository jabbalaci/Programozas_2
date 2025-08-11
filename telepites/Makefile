fname := szoftverigeny

cat:
	cat Makefile | grep -v "^#"

watch:
	ls *.Rmd | entr make pdf

pdf:
	Rscript -e "rmarkdown::render('${fname}.Rmd')"

edit:
	code .

open:
	okular ${fname}.pdf &>/dev/null &

clean:
	\rm ./${fname}.pdf
