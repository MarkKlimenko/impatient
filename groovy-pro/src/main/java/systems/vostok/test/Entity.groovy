package systems.vostok.test

import groovy.transform.Canonical
import groovy.transform.EqualsAndHashCode

@Canonical
@EqualsAndHashCode(includes = ['sId'])
class Entity {
    int id
    String sId
}
