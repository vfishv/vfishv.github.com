sudo gem install rails
rvm install ruby-1.9.3-p392


rails -v
rails --version
rvm list
ruby -v
rvm use 1.9.3
rvm rubygems latest

rake preview
rake generate
rake deploy
http://127.0.0.1:4000

cd /Users/cheungquentin/Documents/Quentin/
/**
git clone git://github.com/imathis/octopress.git octopress
cd octopress
You are using '.rvmrc', it requires trusting, it is slower and it is not compatible with other ruby managers,
you can switch to '.ruby-version' using 'rvm rvmrc to [.]ruby-version'
or ignore this warnings with 'rvm rvmrc warning ignore /Users/cheungquentin/Documents/Quentin/octopress/.rvmrc',
'.rvmrc' will continue to be the default project file in RVM 1 and RVM 2,
to ignore the warning for all files run 'rvm rvmrc warning ignore all.rvmrcs'.

******************************************************************************************************
* NOTICE                                                                                             *
******************************************************************************************************
* RVM has encountered a new or modified .rvmrc file in the current directory, this is a shell        *
* script and therefore may contain any shell commands.                                               *
*                                                                                                    *
* Examine the contents of this file carefully to be sure the contents are safe before trusting it!   *
* Do you wish to trust '/Users/cheungquentin/Documents/Quentin/octopress/.rvmrc'?                    *
* Choose v[iew] below to view the contents                                                           *
******************************************************************************************************
y[es], n[o], v[iew], c[ancel]> yes
Using /Users/cheungquentin/.rvm/gems/ruby-1.9.3-p392
**/
ruby --version
gem install bundler

rbenv rehash
bundle install
rake install
rake setup_github_pages

/**
Enter the read/write url for your repository
(For example, 'git@github.com:your_username/your_username.github.com)
Repository url: git@github.com:vfishv/vfishv.github.com
Added remote git@github.com:vfishv/vfishv.github.com as origin
Set origin as default remote
Master branch renamed to 'source' for committing your blog source files
rm -rf _deploy
mkdir _deploy
cd _deploy
Initialized empty Git repository in /Users/cheungquentin/Documents/Quentin/octopress/_deploy/.git/
[master (root-commit) aef4c8f] Octopress init
 1 files changed, 1 insertions(+), 0 deletions(-)
 create mode 100644 index.html
cd -

---
## Now you can deploy to http://vfishv.github.com with `rake deploy` ##
**/

rake install
rake generate
rake preview
rake deploy

git add .
git commit -m "vfishv Octopress"
git push origin source 

git add .
git commit -m "vfishv Octopress" 
rake deploy
git push
rake preview
rake generate
rake deploy
rake new_post["First Github Page powered by octopress"] 
rake preview
rake generate
rake deploy
git push
git add .

rake new_page["about"]
rake new_page["china metro"]
git clone git://github.com/tommy351/Octopress-Theme-Slash.git .themes/slash
rake install['slash']

git add .
git commit -m 'vfishv blog'
git push origin source
git add ChinaMetro.apk

rbenv global 1.9.3-p392
rbenv global 1.9.3

rbenv install 1.9.3-p194
rbenv global 1.9.3-p194
git config http.postBuffer 524288000

//updating MacPorts base sources using rsync
sudo port -v selfupdate
sudo port install meld

