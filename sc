#!/bin/bash
DEST=""

JERICO_SC="jerico"
JERICO_PATH="/var/ruby/jerico"

DOOMSDAY_SC="doomsday"
DOOMSDAY_PATH="/var/ruby/doomsday"

JIS_SC="jis"
JIS_PATH="/var/ruby/cloudficacao-jis"

HEIMDALL_SC="heimdall"
HEIMDALL_PATH="/var/ruby/cloudficacao-heimdall"

INFRA_SC="infra"
INFRA_PATH="/var/ruby/cloudficacao-infra"

options="$JERICO_SC $JIS_SC $DOOMSDAY_SC $HEIMDALL_SC $INFRA_SC" 

while [ $# -gt 0 ]; do
  arg=$1
  case $arg in
    $JERICO_SC)
      DEST=$JERICO_PATH
    ;;
    $DOOMSDAY_SC)
      DEST=$DOOMSDAY_PATH
    ;;
    $JIS_SC)
      DEST=$JIS_PATH
    ;;
    $HEIMDALL_SC)
      DEST=$HEIMDALL_PATH
    ;;
    $INFRA_SC)
      DEST=$INFRA_PATH
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

#if [ "$1" = $JERICO_SC ]
#then
#  DEST=$JERICO_PATH
#fi

#if [ "$1" = $DOOMSDAY_SC ]
#then
#  DEST=$DOOMDAY_PATH
#fi

#if [ "$1" = $JIS_SC ]
#then
#  DEST=$JIS_PATH
#fi

#if [ "$1" = $HEIMDALL_SC ]
#then
#  DEST=$HEIMDALL_PATH
#fi

#if [ "$1" = $INFRA_SC ]
#then
#  DEST=$INFRA_PATH
#fi

if [ -n "$DEST" ]
then
  cd $DEST
  exec /bin/bash --login
fi
