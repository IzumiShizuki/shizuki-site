.class public final Landroidx/lifecycle/j0;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public final b:Lch/l;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 6
    new-instance v0, Lch/l;

    .line 7
    sget-object v1, Lvb/s;->a:Lvb/s;

    invoke-direct {v0, v1}, Lch/l;-><init>(Ljava/util/Map;)V

    .line 8
    iput-object v0, p0, Landroidx/lifecycle/j0;->b:Lch/l;

    return-void
.end method

.method public constructor <init>(Lwb/e;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Landroidx/lifecycle/j0;->a:Ljava/util/LinkedHashMap;

    .line 3
    new-instance v0, Lch/l;

    invoke-direct {v0, p1}, Lch/l;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Landroidx/lifecycle/j0;->b:Lch/l;

    return-void
.end method
