const createData = require('./script');


test('Test returning types of create data function', () => {
    
    /*
    let res = {
        nodes: [
          { id: 0, label: undefined },
          { id: 1, label: 'Delhi' },
          { id: 2, label: 'Mumbai' },
          { id: 3, label: 'Gujarat' },
          { id: 4, label: 'Goa' },
          { id: 5, label: 'Kanpur' },
          { id: 6, label: 'Jammu' },
          { id: 7, label: 'Hyderabad' }
        ],
        edges: [
          { from: 1, to: 0, color: 'orange', label: '69' },
          { from: 2, to: 1, color: 'orange', label: '81' },
          { from: 3, to: 1, color: 'orange', label: '74' },
          { from: 4, to: 2, color: 'orange', label: '43' },
          { from: 5, to: 1, color: 'orange', label: '87' },
          { from: 6, to: 1, color: 'orange', label: '73' },
          { from: 7, to: 2, color: 'orange', label: '71' }
        ]
      };
    */

    const target = createData();

    expect(target && typeof target === 'object').toBe(true);

    expect(Array.isArray(target.nodes)).toBe(true);

    expect(Array.isArray(target.edges)).toBe(true);
});