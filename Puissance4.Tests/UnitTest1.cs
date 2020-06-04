using System;
using Xunit;
using puissance4.src;


namespace Puissance4.Tests
{
    public class UnitTest1
    {
        [Fact]
        public void Test1()
        {
            var sut = new Game();
            Assert.NotNull(sut);
        }
    }
}
