import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()
import jenkins.model.*
import hudson.security.*

def instance = Jenkins.getInstance()

def realm = instance.getSecurityRealm()

if (realm instanceof HudsonPrivateSecurityRealm) {
    def user = realm.createAccount("admin", "NewPassword123!")
    user.save()
}

instance.save()
