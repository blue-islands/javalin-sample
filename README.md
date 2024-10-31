# Tomcatで動かすJavalinとThymeleafによるWebアプリケーションのサンプル

このリポジトリは、以下のQiita記事に基づいたサンプルプロジェクトです：

- [JavalinをTomcatで動かす方法](https://qiita.com/blue_islands/items/cf532389fdf78e64d316)
- [JavalinとThymeleafでWebアプリケーションを構築する方法](https://qiita.com/blue_islands/items/58154cb63995d29fbd2c)

## 概要

本プロジェクトは、以下の2つのサンプルから構成されています：

1. **JavalinをTomcatで動かすサンプル**  
   Tomcatコンテナ上でJavalinを動かすための設定ファイルやコードを含みます。

2. **ThymeleafでWebアプリケーションを構築するサンプル**  
   JavalinとThymeleafを連携させ、HTMLテンプレートを利用したWebアプリケーションを構築します。

## 必要条件

- Java 17以上
- Maven

## セットアップ手順

1. リポジトリをクローンします：
   ```bash
   git clone https://github.com/username/repository_name.git
   ```
2. 必要な依存関係をインストールします：
   ```bash
   mvn install
   ```

## 実行方法

1. JavalinをTomcat上で動かすサンプルの実行方法：
   - `src/main/java/...` 内のエントリーポイントを実行します。

2. Thymeleafを使ったWebアプリケーションサンプルの実行方法：
   - `src/main/resources/templates/`にHTMLテンプレートを配置し、エントリーポイントを実行します。
