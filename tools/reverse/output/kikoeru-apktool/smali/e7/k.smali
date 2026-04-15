.class public final Le7/k;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lp4/p;


# direct methods
.method public constructor <init>(Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "state"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    const-class v0, Le7/k;

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 9
    new-instance v0, Lp4/p;

    invoke-direct {v0, p1}, Lp4/p;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Le7/k;->a:Lp4/p;

    return-void
.end method

.method public constructor <init>(Le7/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lp4/p;

    .line 3
    iget-object v1, p1, Le7/j;->b:Le7/u;

    .line 4
    iget-object v1, v1, Le7/u;->b:Lh7/i;

    .line 5
    iget v1, v1, Lh7/i;->a:I

    .line 6
    invoke-direct {v0, p1, v1}, Lp4/p;-><init>(Le7/j;I)V

    iput-object v0, p0, Le7/k;->a:Lp4/p;

    return-void
.end method
