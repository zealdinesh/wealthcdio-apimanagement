# wealthcdio-apimanagement

## Overview
This project implements a Traffic Light Controller API that manages traffic lights at an intersection.
The system controls traffic light state transitions (Red, Yellow, Green) for multiple directions and ensures
that conflicting directions are never green at the same time.

The system is implemented as a finite state machine and exposes REST APIs to control and monitor traffic lights.

---

## Features
- Traffic light state transitions (Red → Yellow → Green)
- Pause and resume traffic light operation
- Manual override to force next state
- Traffic light state history tracking
- Validation to prevent conflicting green lights
- REST API with OpenAPI documentation
- Test-driven development with JUnit tests

## API Endpoints

| Method | Endpoint | Description |
|-------|----------|-------------|
| GET | /api/traffic/status | Get current traffic light status |
| GET | /api/traffic/history | Get traffic light history |
| GET | /api/traffic/pause | Pause traffic lights |
| GET | /api/traffic/resume | Resume traffic lights |
| POST | /api/traffic/sequence | Change traffic timing sequence |

