unix-tools
==========

INSTALLATION
============
Unzip the folder unix-tools.
Set an environment variable UNIX_TOOLS to the path of unzipped folder.
Set the PATH variable to %UNIX_TOOLS%\bin

##WC

It counts number of words,characters and lines from given text.

`pgwc.sh filename`

This has some optional arguments like `-l -w -c`

`-l` -- gives number of lines

`-w` -- gives number of words

`-c` -- fives number of characters

This command will give number of lines,words,characters.

You Have to give whole path of text file.

For Example :- `pgwc.sh -l -w -c a.txt` will result in `6 25 100 a.txt`.

File name should be the last argument

##Head

It displays top 10 lines of file by default.

`pghead.sh filename`

This command will give top 10 lines from the text file given

    Example: `pghead a.txt` will print 10 lines from a.txt file.

`pghead.sh -[no.of lines] filename`

    Example: `pghead.sh -11 a.txt` will display top 11 lines from a.txt file.

Filename should be the last argument


##Tail

It displays 10 lines of file from bottom.

`pgtail.sh filename`

This command will give bottom 10 lines from the text file given

    Example: `pgtail.sh a.txt` will print 10 lines from a.txt file.

`pgtail.sh -[no.of lines] filename`

This will give the no. of lines specified in given command.

    Example: `pgtail.sh -4 a.txt` will display bottom 4 lines from a.txt file.

Filename should be the last argument

##Uniq

This is Uniq tool,which discards one of successive identical lines from input but it will not discard indentical lines if they are not successive.

`pguniq.sh filename`

    Example: `pguniq.sh a.txt` will give all unique lines in a.txt file.

##Cut

This is Cut tool,which cuts and gives the output according to given command.

`pgcut.sh -f[fieldno] -d[delimiter] filename`

Default field number is 1.
Default delimiter is tab.

This command will display the contents of specified field

    Example: pgcut.sh -f1,2 -d";" names.txt will display contents with single space of 1st fields from a.txt

Filename should be the last argument

##Sort

This is Sort tool, which sorts the given content with given option.

`pgsort.sh -f[fieldnumber] -d[delimiter] -r filename`

`-r` -- is for reverse

Default field number is 1.
Default delimiter is space.

    Example: `pgsort.sh -f1 -d";" -r a.txt` will display all contents from a.txt file in sorted order.

Default delimiter is tab.


##ReduceSpace

This tool reducesspaces.
`pgreducespaces.sh filename`


Example: `pgreducespaces.sh a.txt`.