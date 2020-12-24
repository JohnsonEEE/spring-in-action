/*
 *
 *
 * Copyright ( c ) 2020 TH Supcom Corporation. All Rights Reserved.
 *
 * This software is the confidential and proprietary information of TH Supcom
 * Corporation ("Confidential Information").  You shall not disclose such
 * Confidential Information and shall use it only in accordance with the terms
 * of the license agreement you entered into with TH Supcom Corporation or a TH Supcom
 * authorized reseller (the "License Agreement"). TH Supcom may make changes to the
 * Confidential Information from time to time. Such Confidential Information may
 * contain errors.
 *
 * EXCEPT AS EXPLICITLY SET FORTH IN THE LICENSE AGREEMENT, TH Supcom DISCLAIMS ALL
 * WARRANTIES, COVENANTS, REPRESENTATIONS, INDEMNITIES, AND GUARANTEES WITH
 * RESPECT TO SOFTWARE AND DOCUMENTATION, WHETHER EXPRESS OR IMPLIED, WRITTEN OR
 * ORAL, STATUTORY OR OTHERWISE INCLUDING, WITHOUT LIMITATION, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY, TITLE, NON-INFRINGEMENT AND FITNESS FOR A
 * PARTICULAR PURPOSE. TH Supcom DOES NOT WARRANT THAT END USER'S USE OF THE
 * SOFTWARE WILL BE UNINTERRUPTED, ERROR FREE OR SECURE.
 *
 * TH Supcom SHALL NOT BE LIABLE TO END USER, OR ANY OTHER PERSON, CORPORATION OR
 * ENTITY FOR INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY OR CONSEQUENTIAL
 * DAMAGES, OR DAMAGES FOR LOSS OF PROFITS, REVENUE, DATA OR USE, WHETHER IN AN
 * ACTION IN CONTRACT, TORT OR OTHERWISE, EVEN IF TH Supcom HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES. TH Supcom' TOTAL LIABILITY TO END USER SHALL NOT
 * EXCEED THE AMOUNTS PAID FOR THE TH Supcom SOFTWARE BY END USER DURING THE PRIOR
 * TWELVE (12) MONTHS FROM THE DATE IN WHICH THE CLAIM AROSE.  BECAUSE SOME
 * STATES OR JURISDICTIONS DO NOT ALLOW LIMITATION OR EXCLUSION OF CONSEQUENTIAL
 * OR INCIDENTAL DAMAGES, THE ABOVE LIMITATION MAY NOT APPLY TO END USER.
 *
 * Copyright version 2.0
 */
package org.yiyi.spring.iocstart.entity.xml;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author yi.yi
 * @date 2020.12.17
 */
public class AwareDemoBean implements BeanPostProcessor, BeanNameAware, BeanClassLoaderAware, BeanFactoryAware, ApplicationContextAware, InitializingBean
{

    public void setBeanName (String name)
    {
        System.out.println ("setBeanName: " + name);
    }

    public void afterPropertiesSet () throws Exception
    {
        System.out.println ("afterPropertiesSet");
    }

    public Object postProcessBeforeInitialization (Object bean, String beanName) throws BeansException
    {
        System.out.println ("postProcessBeforeInitialization: " + beanName);
        return bean;
    }

    public Object postProcessAfterInitialization (Object bean, String beanName) throws BeansException
    {
        System.out.println ("postProcessAfterInitialization: " + beanName);
        return bean;
    }

    public void setApplicationContext (ApplicationContext applicationContext) throws BeansException
    {
        System.out.println ("setApplicationContext");
    }

    public void beanInit ()
    {
        System.out.println ("beanInit");
    }

    public void setBeanClassLoader (ClassLoader classLoader)
    {
        System.out.println ("setBeanClassLoader");
    }

    public void setBeanFactory (BeanFactory beanFactory) throws BeansException
    {
        System.out.println ("setBeanFactory");
    }
}
