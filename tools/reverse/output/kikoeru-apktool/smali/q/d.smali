.class public final Lq/d;
.super Ljc/m;
.source "r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed"

# interfaces
.implements Lic/n;


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lr/q1;

.field public final synthetic d:Lj1/q;

.field public final synthetic e:Lf1/f;

.field public final synthetic f:I

.field public final synthetic g:Lub/e;

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lr/q1;Lic/k;Lj1/q;Lq/q0;Lq/r0;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq/d;->b:I

    .line 1
    iput-object p1, p0, Lq/d;->c:Lr/q1;

    check-cast p2, Ljc/m;

    iput-object p2, p0, Lq/d;->g:Lub/e;

    iput-object p3, p0, Lq/d;->d:Lj1/q;

    iput-object p4, p0, Lq/d;->h:Ljava/lang/Object;

    iput-object p5, p0, Lq/d;->i:Ljava/lang/Object;

    iput-object p6, p0, Lq/d;->e:Lf1/f;

    iput p7, p0, Lq/d;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lr/q1;Lj1/q;Lic/k;Lj1/d;Lic/k;Lf1/f;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq/d;->b:I

    .line 2
    iput-object p1, p0, Lq/d;->c:Lr/q1;

    iput-object p2, p0, Lq/d;->d:Lj1/q;

    iput-object p3, p0, Lq/d;->g:Lub/e;

    iput-object p4, p0, Lq/d;->i:Ljava/lang/Object;

    iput-object p5, p0, Lq/d;->h:Ljava/lang/Object;

    iput-object p6, p0, Lq/d;->e:Lf1/f;

    iput p7, p0, Lq/d;->f:I

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Ljc/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final q(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lq/d;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    move-object v7, p1

    .line 7
    check-cast v7, Lx0/o;

    .line 8
    .line 9
    check-cast p2, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, Lq/d;->g:Lub/e;

    .line 15
    .line 16
    move-object v2, p1

    .line 17
    check-cast v2, Ljc/m;

    .line 18
    .line 19
    iget-object p1, p0, Lq/d;->h:Ljava/lang/Object;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Lq/q0;

    .line 23
    .line 24
    iget-object p1, p0, Lq/d;->i:Ljava/lang/Object;

    .line 25
    .line 26
    move-object v5, p1

    .line 27
    check-cast v5, Lq/r0;

    .line 28
    .line 29
    iget p1, p0, Lq/d;->f:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iget-object v1, p0, Lq/d;->c:Lr/q1;

    .line 38
    .line 39
    iget-object v3, p0, Lq/d;->d:Lj1/q;

    .line 40
    .line 41
    iget-object v6, p0, Lq/d;->e:Lf1/f;

    .line 42
    .line 43
    invoke-static/range {v1 .. v8}, Landroidx/compose/animation/b;->d(Lr/q1;Lic/k;Lj1/q;Lq/q0;Lq/r0;Lf1/f;Lx0/o;I)V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_0
    move-object v6, p1

    .line 50
    check-cast v6, Lx0/o;

    .line 51
    .line 52
    check-cast p2, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lq/d;->g:Lub/e;

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Lic/k;

    .line 61
    .line 62
    iget-object p1, p0, Lq/d;->i:Ljava/lang/Object;

    .line 63
    .line 64
    move-object v3, p1

    .line 65
    check-cast v3, Lj1/d;

    .line 66
    .line 67
    iget-object p1, p0, Lq/d;->h:Ljava/lang/Object;

    .line 68
    .line 69
    move-object v4, p1

    .line 70
    check-cast v4, Lic/k;

    .line 71
    .line 72
    iget p1, p0, Lq/d;->f:I

    .line 73
    .line 74
    or-int/lit8 p1, p1, 0x1

    .line 75
    .line 76
    invoke-static {p1}, Lx0/v;->D(I)I

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    iget-object v0, p0, Lq/d;->c:Lr/q1;

    .line 81
    .line 82
    iget-object v1, p0, Lq/d;->d:Lj1/q;

    .line 83
    .line 84
    iget-object v5, p0, Lq/d;->e:Lf1/f;

    .line 85
    .line 86
    invoke-static/range {v0 .. v7}, Landroidx/compose/animation/a;->a(Lr/q1;Lj1/q;Lic/k;Lj1/d;Lic/k;Lf1/f;Lx0/o;I)V

    .line 87
    .line 88
    .line 89
    sget-object p1, Lub/a0;->a:Lub/a0;

    .line 90
    .line 91
    return-object p1

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
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
