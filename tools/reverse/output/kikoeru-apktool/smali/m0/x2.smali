.class public abstract Lm0/x2;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"


# static fields
.field public static final a:Lx0/o2;

.field public static final b:Lx0/z;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Li9/f;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lx0/o2;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lx0/m1;-><init>(Lic/a;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Lm0/x2;->a:Lx0/o2;

    .line 14
    .line 15
    new-instance v0, Li9/f;

    .line 16
    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    invoke-direct {v0, v1}, Li9/f;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lx0/z;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lx0/z;-><init>(Lic/a;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Lm0/x2;->b:Lx0/z;

    .line 28
    .line 29
    return-void
.end method
