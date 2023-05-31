#include <unordered_map>
#include <vector>
#include <string>

class UndergroundSystem {
    std::unordered_map<int, std::pair<std::string, int>> hm; // map id to start station and arrival time via pair
    std::unordered_map<std::string, std::vector<int>> avg; // map start station + "to:" + end station to an array of total time taken between routes
    
public:
    UndergroundSystem() {
        // Constructor
    }
    
    void checkIn(int id, std::string stationName, int t) {
        std::pair<std::string, int> Ckin(stationName, t);
        hm[id] = Ckin; // store the check-in details for the given id
    }
    
    void checkOut(int id, std::string stationName, int t) {
        std::pair<std::string, int> Ckout = hm[id]; // retrieve the check-in details for the given id
        std::string path = Ckout.first + "to:" + stationName; // create a path from start station to end station
        int timeT = t - Ckout.second; // calculate the total time taken between stations
        
        if (avg.find(path) != avg.end()) {
            avg[path].push_back(timeT); // if path exists, add the time taken to the existing list
        }
        else {
            std::vector<int> ar;
            ar.push_back(timeT); // create a new list and add the time taken
            avg[path] = ar;
        }
        
        hm.erase(id); // remove the id from the map as the journey is completed
    }
    
    double getAverageTime(std::string startStation, std::string endStation) {
        std::string path = startStation + "to:" + endStation;
        std::vector<int> av = avg[path]; // get the associated list of times for the path
        double sol = 0;
        
        for (int i : av) {
            sol += i; // calculate the sum of times
        }
        
        return sol / av.size(); // return the average time
    }
};

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj;
 * obj.checkIn(id, stationName, t);
 * obj.checkOut(id, stationName, t);
 * double param_3 = obj.getAverageTime(startStation, endStation);
 */
