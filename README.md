# Yocto BSP for Allwinner F1C100s


## Host build: Ubuntu20.04 LTS

```shell
cd ~

mkdir yocto

cd yocto

git clone git://git.yoctoproject.org/poky -b zeus

cd poky

git clone git://git.openembedded.org/meta-openembedded.git -b zeus

git clone https://github.com/ninhnn2/meta-f1c100s.git -b zeus

source oe-init-build-env build-f1c100s

cp ../meta-f1c100s/conf/sample/local.conf.sample ./conf/local.conf

cp ../meta-f1c100s/conf/sample/bblayers.conf.sample ./conf/bblayers.conf

bitbake core-image-minimal
```

## My build image for testing 

[download link](https://mega.nz/file/UiBWnDRQ#jSAgU6_mVsZ91opM_cSA_pZ5nb5aLgdd0M5-xkwwXFA)


