const createGraph = require('./Graph');


test('Test create graph function', () => {
    
    const V = 5;
    const E = [ [1,2,3], [1,4,2], [3,5,1], [3,4,3] ];

    let res = [
      [],
      [ [ 2, 3 ], [ 4, 2 ] ],
      [ [ 1, 3 ] ],
      [ [ 5, 1 ], [ 4, 3 ] ],
      [ [ 1, 2 ], [ 3, 3 ] ],
      [ [ 3, 1 ] ]
    ];
    
    expect(createGraph(V, E)).toStrictEqual(res);
});