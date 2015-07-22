#!/bin/bash
branch_name="$1"
echo "Creating branch $branch_name"
git checkout -b $branch_name
git push origin $branch_name
