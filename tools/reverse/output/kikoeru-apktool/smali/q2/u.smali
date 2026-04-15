.class public abstract Lq2/u;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lq2/w;

.field public static final b:Lq2/w;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lq2/w;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lq2/s;->r:Lq2/s;

    .line 5
    .line 6
    const-string v3, "TestTagsAsResourceId"

    .line 7
    .line 8
    invoke-direct {v0, v2, v3, v1}, Lq2/w;-><init>(Lic/n;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lq2/u;->a:Lq2/w;

    .line 12
    .line 13
    sget-object v0, Lq2/s;->q:Lq2/s;

    .line 14
    .line 15
    new-instance v1, Lq2/w;

    .line 16
    .line 17
    const/4 v2, 0x1

    .line 18
    const-string v3, "AccessibilityClassName"

    .line 19
    .line 20
    invoke-direct {v1, v0, v3, v2}, Lq2/w;-><init>(Lic/n;Ljava/lang/String;Z)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lq2/u;->b:Lq2/w;

    .line 24
    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
.end method
