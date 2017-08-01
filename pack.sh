#!/usr/bin/env bash
pushd target
/mnt/c/Apps/OctopusTools.4.18.0.ubuntu.16.04-x64/Octo pack --include ejbtest.jar --id=EJBTest --version=0.0.0.1 --format=zip --overwrite
popd