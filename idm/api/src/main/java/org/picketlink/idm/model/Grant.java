package org.picketlink.idm.model;

import org.picketlink.idm.model.annotation.RelationshipIdentity;
import org.picketlink.idm.query.QueryParameter;

/**
 * Represents the grant of a Role to an Assignee 
 * 
 * @author Shane Bryzak
 */
public class Grant extends AbstractAttributedType implements Relationship {
    private static final long serialVersionUID = -200089007240264375L;

    QueryParameter ASSIGNEE = new QueryParameter() {};

    QueryParameter ROLE = new QueryParameter() {};

    private IdentityType assignee;
    private Role role;

    public Grant(IdentityType assignee, Role role) {
        this.assignee = assignee;
        this.role = role;
    }

    @RelationshipIdentity
    public IdentityType getAssignee() {
        return assignee;
    }

    @RelationshipIdentity
    public Role getRole() {
        return role;
    }
}
