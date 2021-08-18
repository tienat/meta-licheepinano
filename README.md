# meta-f1c100s


TEST ENV: Ubuntu 20.04

```shell
cd ~

mkdir yocto

cd yocto

git clone git://git.yoctoproject.org/poky -b zeus

cd poky

git clone git://git.openembedded.org/meta-openembedded.git -b zeus

git clone https://github.com/ninhnn2/meta-f1c100s.git -b zeus

source oe-init-build-env build-f1c100s

bitbake core-image-minimal
```

# Yocto Rom Test

[download link](https://mega.nz/file/UiBWnDRQ#jSAgU6_mVsZ91opM_cSA_pZ5nb5aLgdd0M5-xkwwXFA)
