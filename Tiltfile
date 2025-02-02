# How to build a container image (Cloud Native Buildpacks)
# Build
custom_build(
    # Name of the container image
    ref = 'order-service',
    # Command to build the container image
    command = './gradlew bootBuildImage --imageName $EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['build.gradle', 'src']
)

# How to deploy the application (Kubernetes YAML manifests)
# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# How to access the application (port forwarding)
# Manage
k8s_resource('order-service', port_forwards=['9002'])