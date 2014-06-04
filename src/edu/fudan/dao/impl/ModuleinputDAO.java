package edu.fudan.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.fudan.dao.IModuleinputDAO;
import edu.fudan.pojo.Moduleinput;

/**
 * A data access object (DAO) providing persistence and search support for
 * Moduleinput entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see edu.fudan.pojo.Moduleinput
 * @author MyEclipse Persistence Tools
 */

public class ModuleinputDAO extends HibernateDaoSupport implements IModuleinputDAO {
	private static final Logger log = LoggerFactory
			.getLogger(ModuleinputDAO.class);
	// property constants
	public static final String INPUT = "input";
	public static final String MODULE_ID = "moduleId";
	public static final String REGEX = "regex";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleinputDAO#save(edu.fudan.pojo.Moduleinput)
	 */
	@Override
	public void save(Moduleinput transientInstance) {
		log.debug("saving Moduleinput instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Moduleinput persistentInstance) {
		log.debug("deleting Moduleinput instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleinputDAO#findById(java.lang.Integer)
	 */
	@Override
	public Moduleinput findById(java.lang.Integer id) {
		log.debug("getting Moduleinput instance with id: " + id);
		try {
			Moduleinput instance = (Moduleinput) getHibernateTemplate().get(
					"edu.fudan.pojo.Moduleinput", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Moduleinput instance) {
		log.debug("finding Moduleinput instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Moduleinput instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Moduleinput as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleinputDAO#findByInput(java.lang.Object)
	 */
	@Override
	public List findByInput(Object input) {
		return findByProperty(INPUT, input);
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleinputDAO#findByModuleId(java.lang.Object)
	 */
	@Override
	public List findByModuleId(Object moduleId) {
		return findByProperty(MODULE_ID, moduleId);
	}

	public List findByRegex(Object regex) {
		return findByProperty(REGEX, regex);
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleinputDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Moduleinput instances");
		try {
			String queryString = "from Moduleinput";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Moduleinput merge(Moduleinput detachedInstance) {
		log.debug("merging Moduleinput instance");
		try {
			Moduleinput result = (Moduleinput) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Moduleinput instance) {
		log.debug("attaching dirty Moduleinput instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Moduleinput instance) {
		log.debug("attaching clean Moduleinput instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IModuleinputDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IModuleinputDAO) ctx.getBean("ModuleinputDAO");
	}
}