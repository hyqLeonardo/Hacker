% Based on https://www.youtube.com/watch?v=6jwDPk1_l40

%%
x = linspace(0, 10*pi, 1000);
y = cos(x);
z = sin(x);
comet3(x, y, z); % Animation, cool~
% for only plot, use plot3()
grid;
xlabel('angle');
ylabel('cos(x)');
zlabel('sin(x)');
title('A spring');
%%
t = 0 : 0.1 : 10;
x = exp(-0.2*t) .* cos(2*t);
y = exp(-0.2*t) .* sin(2*t);

plot(t, x);
input('Press Enter to Continue ...');
plot(t, y);
input('Press Enter to Continue ...');
comet3(x, y, t);
xlabel('x');
ylabel('y');
zlabel('time');


%%
z = [1 2 3 4 5 6 7 8 9 10; 
     2 4 6 8 10 12 14 16 18 20;
     3 4 5 6 7 8 9 10 11 12];
 subplot(2, 1, 1);
 mesh(z)
 xlabel('x-axis')
 ylabel('y-axis')
 zlabel('z-axis')
 subplot(2, 1, 2);
 mesh(1:10, 1:3, z);
 xlabel('x - axis');
 ylabel('y - axis');
 zlabel('z - axis');
 %%
 z = [1:10;2:2:20;3:12];
 x = linspace(1, 1000, 10);
 y = linspace(pi, exp(1), 3);
 mesh(z);
 pause(10);
 mesh(x, y, z);
 pause(5);
 surf(x, y, z);
 
 %%
 Xvals = -2 : 1 : 2;
 Yvals = -2 : 1 : 2;
 
 [X, Y] = meshgrid(Xvals, Yvals);
 
 Z = X .* exp(-(X.^2 + Y.^2));
 subplot(2, 2, 1);
 mesh(X, Y, Z);
 ylabel('y - axis'), zlabel('z - axis'), title('mesh plot');
 
 subplot(2, 2, 2);
 surf(X, Y, Z);
 ylabel('y - axis'), zlabel('z - axis'), title('Surface plot');
 
 subplot(2, 2, 3);
 contour(X, Y, Z);
 ylabel('y - axis'), zlabel('z - axis'), title('contour plot');
 
 subplot(2, 2, 4);
 surfc(X, Y, Z);
 ylabel('y - axis'), zlabel('z - axis'), title('Surface contour');
 
 % Try to change interval of X and Y to 0.1 !
 
 
