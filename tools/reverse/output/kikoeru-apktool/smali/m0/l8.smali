.class public final Lm0/l8;
.super Ljava/lang/Object;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Float;

.field public final synthetic d:Lic/n;


# direct methods
.method public constructor <init>(JLjava/lang/Float;Lic/n;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lm0/l8;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lm0/l8;->b:J

    iput-object p3, p0, Lm0/l8;->c:Ljava/lang/Float;

    iput-object p4, p0, Lm0/l8;->d:Lic/n;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Float;Lic/n;J)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm0/l8;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm0/l8;->c:Ljava/lang/Float;

    iput-object p2, p0, Lm0/l8;->d:Lic/n;

    iput-wide p3, p0, Lm0/l8;->b:J

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lm0/l8;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lx0/o;

    .line 7
    .line 8
    check-cast p2, Ljava/lang/Number;

    .line 9
    .line 10
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 11
    .line 12
    .line 13
    move-result p2

    .line 14
    and-int/lit8 v0, p2, 0x3

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    :goto_0
    and-int/2addr p2, v2

    .line 24
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-eqz p2, :cond_1

    .line 29
    .line 30
    sget-object p2, Lm0/j1;->a:Lx0/z;

    .line 31
    .line 32
    new-instance v0, Lq1/q;

    .line 33
    .line 34
    iget-wide v1, p0, Lm0/l8;->b:J

    .line 35
    .line 36
    invoke-direct {v0, v1, v2}, Lq1/q;-><init>(J)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2, v0}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 40
    .line 41
    .line 42
    move-result-object p2

    .line 43
    new-instance v0, Lm0/l8;

    .line 44
    .line 45
    iget-object v3, p0, Lm0/l8;->c:Ljava/lang/Float;

    .line 46
    .line 47
    iget-object v4, p0, Lm0/l8;->d:Lic/n;

    .line 48
    .line 49
    invoke-direct {v0, v3, v4, v1, v2}, Lm0/l8;-><init>(Ljava/lang/Float;Lic/n;J)V

    .line 50
    .line 51
    .line 52
    const v1, -0x60d57365

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v0, p1}, Lf1/g;->f(ILub/e;Lx0/o;)Lf1/f;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    const/16 v1, 0x38

    .line 60
    .line 61
    invoke-static {p2, v0, p1, v1}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 66
    .line 67
    .line 68
    :goto_1
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    check-cast p1, Lx0/o;

    .line 72
    .line 73
    check-cast p2, Ljava/lang/Number;

    .line 74
    .line 75
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result p2

    .line 79
    and-int/lit8 v0, p2, 0x3

    .line 80
    .line 81
    const/4 v1, 0x2

    .line 82
    const/4 v2, 0x1

    .line 83
    const/4 v3, 0x0

    .line 84
    if-eq v0, v1, :cond_2

    .line 85
    .line 86
    const/4 v0, 0x1

    .line 87
    goto :goto_2

    .line 88
    :cond_2
    const/4 v0, 0x0

    .line 89
    :goto_2
    and-int/2addr p2, v2

    .line 90
    invoke-virtual {p1, p2, v0}, Lx0/o;->N(IZ)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-eqz p2, :cond_4

    .line 95
    .line 96
    const/16 p2, 0x8

    .line 97
    .line 98
    iget-object v0, p0, Lm0/l8;->d:Lic/n;

    .line 99
    .line 100
    iget-object v1, p0, Lm0/l8;->c:Ljava/lang/Float;

    .line 101
    .line 102
    if-eqz v1, :cond_3

    .line 103
    .line 104
    const v2, 0x58812ba4

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, v2}, Lx0/o;->W(I)V

    .line 108
    .line 109
    .line 110
    sget-object v2, Lm0/h1;->a:Lx0/z;

    .line 111
    .line 112
    invoke-virtual {v2, v1}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-static {v1, v0, p1, p2}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    const v1, 0x5884373e

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1, v1}, Lx0/o;->W(I)V

    .line 127
    .line 128
    .line 129
    sget-object v1, Lm0/h1;->a:Lx0/z;

    .line 130
    .line 131
    iget-wide v4, p0, Lm0/l8;->b:J

    .line 132
    .line 133
    invoke-static {v4, v5}, Lq1/q;->d(J)F

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 138
    .line 139
    .line 140
    move-result-object v2

    .line 141
    invoke-virtual {v1, v2}, Lx0/z;->a(Ljava/lang/Object;)Lx0/n1;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-static {v1, v0, p1, p2}, Lx0/v;->a(Lx0/n1;Lic/n;Lx0/o;I)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v3}, Lx0/o;->p(Z)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :cond_4
    invoke-virtual {p1}, Lx0/o;->Q()V

    .line 153
    .line 154
    .line 155
    :goto_3
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 156
    .line 157
    return-object p1

    .line 158
    nop

    .line 159
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
