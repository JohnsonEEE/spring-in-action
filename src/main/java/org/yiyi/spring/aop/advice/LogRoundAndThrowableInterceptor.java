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
package org.yiyi.spring.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志interceptor
 *
 * @author yi.yi
 * @date 2020.12.24
 */
public class LogRoundAndThrowableInterceptor extends AbsRoundAndThrowableInterceptor
{

    public void doBefore ()
    {
        System.out.println ("log 前");
    }

    public void doAfter ()
    {
        System.out.println ("log 后");
    }

    public void doWhenThrow ()
    {
        System.out.println ("log 异常");
    }

    public Object doAround (ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println ("log aound 前");
        Object proceed;
        try
        {
            proceed = joinPoint.proceed ();
        }
        catch (Throwable throwable)
        {
            System.out.println ("log aound 异常");
            throw throwable;
        }
        System.out.println ("log aound 后");
        return proceed;
    }
}
