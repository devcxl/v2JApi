#!/bin/bash
# 下载grpc所需proto文件
DOWNLOAD_URL_BASE=https://cdn.jsdelivr.net/gh/v2fly/v2ray-core@4.45.2
TARGET_DIR=$PWD/src/main/proto
rm -r "${TARGET_DIR}"
for dir in '/app/log/command/config.proto' '/app/proxyman/command/command.proto' '/app/stats/command/command.proto' '/common/protocol/user.proto' '/common/serial/typed_message.proto' '/transport/internet/config.proto' '/transport/config.proto' '/config.proto';
do
    curl "${DOWNLOAD_URL_BASE}${dir}" --create-dirs -o "${TARGET_DIR}${dir}"
done


