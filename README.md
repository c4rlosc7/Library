# Library
Library

___
# Git Flow

## Iniciando git flow

```console
$ git branch develop // partiendo de master, se crea develop

$ git push -u origin develop // backup de la rama master

$ git flow init

Which branch should be used for bringing forth production releases?
   - develop
   - master
Branch name for production releases: [master]

Which branch should be used for integration of the "next release"?
   - develop
Branch name for "next release" development: [develop]

How to name your supporting branch prefixes?
Feature branches? [feature/]
Bugfix branches? [bugfix/]
Release branches? [release/]
Hotfix branches? [hotfix/]
Support branches? [support/]
Version tag prefix? []
Hooks and filters directory? [C:/Users/carlmacd/Desktop/Library/.git/hooks]


$ git branch -l // lista de ramas creadas en el repo
  develop
* master
```

## Uso de Tags

```console

```

## Creando Feature

```console
$ git checkout develop // ubicarnos en la rama develop

$ git flow feature start feature_git_flow_summary // creando nueva feature

$ git checkout develop // ubicarnos en la rama develop

$ git flow feature finish feature_git_flow_summary // finalizamos la feature
```

## Creando Release

```console
$ git flow release start release_0.1.0 // crear release

$ git flow release finish 'elease_0.1.0' // finalizar el release
```

## Creando Hotfix

```console
$ git flow hotfix start hotfix_branch

$ git flow hotfix finish hotfix_branch
```

[atlassian gitflow](https://www.atlassian.com/git/tutorials/comparing-workflows/gitflow-workflow)