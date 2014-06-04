package edu.fudan.dao.impl;

import java.util.List;
import org.hibernate.LockMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import edu.fudan.dao.IModuleDAO;
import edu.fudan.pojo.Module;

/**
 * A data access object (DAO) providing persistence and search support for
 * Module entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see edu.fudan.pojo.Module
 * @author MyEclipse Persistence Tools
 */

public class ModuleDAO extends HibernateDaoSupport implements IModuleDAO {
	private static final Logger log = LoggerFactory.getLogger(ModuleDAO.class);
	// property constants
	public static final String DETAIL = "detail";
	public static final String INTRO = "intro";
	public static final String MODULE = "module";
	public static final String STATUS = "status";

	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleDAO#save(edu.fudan.pojo.Module)
	 */
	@Override
	public void save(Module transientInstance) {
		log.debug("saving Module instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Module persistentInstance) {
		log.debug("deleting Module instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleDAO#findById(java.lang.String)
	 */
	@Override
	public Module findById(java.lang.String id) {
		log.debug("getting Module instance with id: " + id);
		try {
			Module instance = (Module) getHibernateTemplate().get(
					"edu.fudan.pojo.Module", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Module instance) {
		log.debug("finding Module instance by example");
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
		log.debug("finding Module instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Module as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDetail(Object detail) {
		return findByProperty(DETAIL, detail);
	}

	public List findByIntro(Object intro) {
		return findByProperty(INTRO, intro);
	}

	public List findByModule(Object module) {
		return findByProperty(MODULE, module);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	/* (non-Javadoc)
	 * @see edu.fudan.dao.impl.IModuleDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Module instances");
		try {
			String queryString = "from Module";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Module merge(Module detachedInstance) {
		log.debug("merging Module instance");
		try {
			Module result = (Module) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Module instance) {
		log.debug("attaching dirty Module instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Module instance) {
		log.debug("attaching clean Module instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IModuleDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IModuleDAO) ctx.getBean("ModuleDAO");
	}
}