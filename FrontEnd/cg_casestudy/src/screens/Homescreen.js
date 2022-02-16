import React, { useState } from "react";
import axios from "axios";
import Select from "react-select";
const courseOptions = [
  {
    value: "AWS Solution Architect Professional",
    label: "AWS Solution Architect Professional",
  },
];

const PeriodOptions = [
  {
    value: "Two Weeks",
    label: "Two Weeks",
  },
  {
    value: "Three Weeks",
    label: "Three Weeks",
  },
];
function Homescreen() {
  const [certificatename, setCertificatename] = useState("");
  const [period, setPeriod] = useState("");
  const [reportmanager, setReportmanager] = useState("");
  //   const [loading, setLoading] = useState(true);
 
  const register = () => {
    const certificate = {
      certificatename,
      period,
      reportmanager,
    };
    try {
      axios
        .post("http://localhost:8684/certificate/add", certificate)
        .then((response) => {
          console.log("response", response);
        });

      setCertificatename("");
      setPeriod("");
      setReportmanager("");
    } catch {
      console.log(certificate);
    }
  };
  return (
    <div style={{ backgroundColor: "white" }}>
      <div className="container" style={{ marginTop: 0 }}>
        <center>
          <div className="card" style={{ width: 600 }}>
            <h5
              className="card-header info-color white-text text-center py-4"
              style={{ backgroundColor: " Black " }}
            >
              <strong style={{ color: "white" }}>
                {" "}
                Certificate Registration{" "}
              </strong>
            </h5>

            <div
              className="card-body px-lg-5 text-center"
              style={{ color: "Black" }}
            >
              {/* <form className="text-center" style={{ color: "Black" }}> */}
              <label> Certificates List </label>
              {/* <select
                className="browser-default custom-select mb-4"
                id="soList"
              >
                <option
                  value={certificatename}
                  onChange={(e) => {
                    console.log("sk value", e.target.value);
                    setcertificatename(e.target.value);
                  }}
                >
                  Select
                </option> */}
              <Select
                onChange={(value) =>{
                    setCertificatename(value.value)
                }}
                options={courseOptions}
                placeholder="Select Course"
              />

              {/* <option value="AWS Solution Architect Professional">
                  {" "}
                  AWS Solution Architect Professional
                </option>
              </select> */}

              <label> Period </label>
              {/* <select
                className="browser-default custom-select mb-4"
                id="deList"
              >
                <option value={period}>Select</option>
                <option value="AWS Solution Architect Professional">
                  {" "}
                  Two Weeks{" "}
                </option>
                <option value="AWS Solution Architect Professional">
                  {" "}
                  Three Weeks{" "}
                </option>
              </select> */}
              <Select
                onChange={(value) =>{
                    setPeriod(value.value)
                }}
                options={PeriodOptions}
                placeholder="Select Course"
              />
              <label> Report Manager : </label>
              <input
                type="text"
                placeholder="reportmanager"
                className="form-control mb-4"
                value={reportmanager}
                onChange={(e) => {
                  setReportmanager(e.target.value);
                }}
              />
              <button className="button1" onClick={register}>
                Register
              </button>
              {/* </form> */}
            </div>
          </div>
        </center>
      </div>
    </div>
  );
}
export default Homescreen;