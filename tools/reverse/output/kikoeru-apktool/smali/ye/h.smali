.class public final Lye/h;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lbe/e;

.field public final b:Lef/l;

.field public final c:Ljava/util/Collection;

.field public final d:Lic/k;

.field public final e:[Lye/e;


# direct methods
.method public varargs constructor <init>(Lbe/e;Lef/l;Ljava/util/Collection;Lic/k;[Lye/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lye/h;->a:Lbe/e;

    .line 3
    iput-object p2, p0, Lye/h;->b:Lef/l;

    .line 4
    iput-object p3, p0, Lye/h;->c:Ljava/util/Collection;

    .line 5
    iput-object p4, p0, Lye/h;->d:Lic/k;

    .line 6
    iput-object p5, p0, Lye/h;->e:[Lye/e;

    return-void
.end method

.method public synthetic constructor <init>(Lbe/e;[Lye/e;)V
    .locals 1

    .line 7
    sget-object v0, Lye/g;->b:Lye/g;

    invoke-direct {p0, p1, p2, v0}, Lye/h;-><init>(Lbe/e;[Lye/e;Lic/k;)V

    return-void
.end method

.method public constructor <init>(Lbe/e;[Lye/e;Lic/k;)V
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lye/e;

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lye/h;-><init>(Lbe/e;Lef/l;Ljava/util/Collection;Lic/k;[Lye/e;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Collection;[Lye/e;)V
    .locals 1

    .line 9
    sget-object v0, Lye/g;->d:Lye/g;

    invoke-direct {p0, p1, p2, v0}, Lye/h;-><init>(Ljava/util/Collection;[Lye/e;Lic/k;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/Collection;[Lye/e;Lic/k;)V
    .locals 6

    const-string v0, "nameList"

    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, [Lye/e;

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    move-object v3, p1

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lye/h;-><init>(Lbe/e;Lef/l;Ljava/util/Collection;Lic/k;[Lye/e;)V

    return-void
.end method
