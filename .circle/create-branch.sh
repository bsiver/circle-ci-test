#!/bin/bash
branch_name="$1"
git checkout -b $branch_name
git push origin $branch_name
