.class public final Lyf/i;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# instance fields
.field public final a:Lwf/w;

.field public b:Z


# direct methods
.method public constructor <init>(Luf/g;)V
    .locals 10

    .line 1
    const-string v0, "descriptor"

    .line 2
    .line 3
    invoke-static {p1, v0}, Ljc/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lwf/w;

    .line 10
    .line 11
    new-instance v1, Lc0/x;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const/4 v9, 0x7

    .line 15
    const/4 v2, 0x2

    .line 16
    const-class v4, Lyf/i;

    .line 17
    .line 18
    const-string v5, "readIfAbsent"

    .line 19
    .line 20
    const-string v6, "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z"

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    move-object v3, p0

    .line 24
    invoke-direct/range {v1 .. v9}, Lc0/x;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;III)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1, v1}, Lwf/w;-><init>(Luf/g;Lc0/x;)V

    .line 28
    .line 29
    .line 30
    iput-object v0, v3, Lyf/i;->a:Lwf/w;

    .line 31
    .line 32
    return-void
    .line 33
    .line 34
    .line 35
    .line 36
.end method
