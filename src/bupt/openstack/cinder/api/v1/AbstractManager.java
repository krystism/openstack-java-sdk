package bupt.openstack.cinder.api.v1;
import bupt.openstack.authentication.Authenticated;
import bupt.openstack.common.Manager;
import bupt.openstack.common.model.AbstractEntity;
import bupt.openstack.keystone.model.CatalogType;

public abstract class AbstractManager<T extends AbstractEntity> extends Manager<T> {

	public AbstractManager(Authenticated credentical, Class<T> objClass) {
		super(credentical, objClass);
	}
	@Override
	public String getEndpoint() {
		return credentical.getEndpoint(CatalogType.volume);
	}
}
