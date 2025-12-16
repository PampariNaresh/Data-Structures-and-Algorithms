{ pkgs ? import <nixpkgs> {} }:

pkgs.mkShell {
  buildInputs = [
    pkgs.sudo
    pkgs.adoptopenjdk-bin
  ];
}
