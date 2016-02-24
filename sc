#!/bin/bash -l
DEST=""

source ~/.cloudficacao.conf

JERICO_SC="jerico"
DOOMSDAY_SC="doomsday"
JIS_SC="jis"
HEIMDALL_SC="heimdall"
INFRA_SC="infra"

options="$JERICO_SC $JIS_SC $DOOMSDAY_SC $HEIMDALL_SC $INFRA_SC" 

while [ $# -gt 0 ]; do
  arg=$1
  case $arg in
    $JERICO_SC)
      DEST=$JERICO_ROOT_DIR
    ;;
    $DOOMSDAY_SC)
      DEST=$DOOMSDAY_ROOT_DIR
    ;;
    $JIS_SC)
      DEST=$JIS_ROOT_DIR
    ;;
    $HEIMDALL_SC)
      DEST=$HEIMDALL_ROOT_DIR
    ;;
    $INFRA_SC)
      DEST=$INFRA_ROOT_DIR
    ;;
    shortlist)
      echo $options
    ;;
    *)
     echo Wrong option
    ;;
  esac
  shift
done

if [ -n "$DEST" ]
then
  cd $DEST
  exec $SHELL -l
 # exec /bin/bash
fi
