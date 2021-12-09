import groovy.json.JsonSlurper

String filePath = "/home/vorting/automatingJenkinsWithGroovy/vars/music.json"

def jsonSlurper = new JsonSlurper()
ArrayList data = jsonSlurper.parse(new File(filePath))

println(data.getClass())

for (artist in data) {
    println(artist.name)
    for (album in artist.albums) {
        println('\t' + album.title)
    }
}