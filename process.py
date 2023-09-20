import os

file_extension_to_keep = '.proto'
directory_path = '/path/to/v2ray-core'  # 请替换为实际目录的路径

for root, dirs, files in os.walk(directory_path):
    for filename in files:
        file_path = os.path.join(root, filename)
        if not filename.endswith(file_extension_to_keep):
            try:
                os.remove(file_path)
                print(f"Deleted: {file_path}")
            except OSError as e:
                print(f"Error deleting {file_path}: {e}")

print("Deletion completed.")