-- Instalação

- $ ln -s {path do project_sc}/sc /usr/bin/sc
- $ ln -s {path do project_sc}/sc_completion /etc/bash_completion.d/sc_completion

-- Configuraçao

- Crie ou edite o arquivo `~/cloudficacao.conf` configurando as seguintes variaveis com o caminho dos projetos:

Exemplo:
```
JIS_ROOT_DIR="/var/www/cloudficacao-jis"
JERICO_ROOT_DIR="/var/www/cloudficacao"
DOOMSDAY_ROOT_DIR="/var/www/doomsday"
HEIMDALL_ROOT_DIR="/var/www/cloudficacao-heimdall"
INFRA_ROOT_DIR="/var/www/cloudficacao-infra"
```

-- Como utilizar

- $ sc [tab]
