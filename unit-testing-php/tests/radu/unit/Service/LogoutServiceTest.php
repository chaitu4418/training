<?php

namespace App\Tests\Service;

use App\Service\LogoutService;
use PHPUnit\Framework\TestCase;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Router;

class LogoutServiceTest extends TestCase
{
    /** @var LogoutService */
    protected $logoutService;

    /** @var Router|\PHPUnit_Framework_MockObject_MockObject */
    protected $routerMock;

    public function setUp()
    {
        parent::setUp(); // TODO: Change the autogenerated stub

        $this->routerMock = static::createMock(Router::class);

        $this->logoutService = new LogoutService($this->routerMock);
    }

    public function testGetRedirectUri()
    {
        $this->routerMock
            ->expects($this->once())
            ->method('generate');

        $this->logoutService->getRedirectUrl(new Request(), 'security_check_route');
    }

    public function testGetState()
    {
        $this->assertEmpty($this->logoutService->getState(new Request()));
    }
}